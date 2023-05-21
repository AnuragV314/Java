package RegularExpressions;

// A regular expression is a sequence of characters that forms a search pattern.
/*
 * -- Pattern Class - Defines a pattern (to be used in a search)
    -- Matcher Class - Used to search for the pattern
    -- PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegularExpressions {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}

/*
 * Flags
 * 
 * Flags in the compile() method change how the search is performed. Here are a
 * few of them:
 * 
 * Pattern.CASE_INSENSITIVE - The case of letters will be ignored when
 * performing a search.
 * 
 * Pattern.LITERAL - Special characters in the pattern will not have any special
 * meaning and will be treated as ordinary characters when performing a search.
 * 
 * Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also
 *  ignore the case of letters outside of the English alphabet
 */
