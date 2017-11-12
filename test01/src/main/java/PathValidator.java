import java.util.ArrayList;

/**
 * This class is validating the path of some file system object in Windows OC.
 * The path is entered as a command-line argument.
 * INVALID_SYMBOLS - is a list of invalid symbols.
 * INVALID_NAMES_STORE - is a list of invalid names.
 */
public class PathValidator {
  final static char[] INVALID_SYMBOLS = {'>', '<', '"','/', '|', '?', '*'};
  final static String[] INVALID_NAMES_STORE = {"CON", "PRN", "AUX", "NUL", "COM1", "COM2",
                                               "COM3", "COM4", "COM5", "COM6", "COM7", "COM8",
                                               "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5",
                                               "LPT6", "LPT7", "LPT8", "LPT9"};
  /**
   * This function detect if the start of the path is valid
   * @param args argument of the command line
   * @return true if path start is valid false otherwise
   */
  private boolean isStartSymbolsValid (String args) {
    if (Character.toUpperCase(args.charAt(0)) >= 'A' &&
        Character.toUpperCase(args.charAt(0)) <= 'Z' && args.charAt(1) == ':') {
      return true;
    } else if (args.charAt(0) == '\\' && args.charAt(1) <= '\\') {
      return true;
    } else if (args.charAt(0) == '.' && args.charAt(1) == '.') {
      return true;
    } else if (args.charAt(0) == '.' && args.charAt(1) =='\\') {
      return true;
    } else
      return false;
  }

  /**
   * Check is path contains only valid symbols.
   * @param args argument of the command line
   * @return true if path doesn't contain invalid symbols.
   */

  private boolean isOnlyValidSymbols(String args) {
    for (int i = 0; i < args.length(); i ++) {
      for (int j = 0; j < INVALID_SYMBOLS.length; j++) {
        if (args.charAt(i) == INVALID_SYMBOLS[j]) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * This function detect is names of the path are valid
   * @param args arguments of the command line
   * @return true if names is valid false otherwise
   */
  private boolean isOnlyValidNames (String args) {
    ArrayList<String> catalogNames = findCatalogNamesIfPathStartsFromDiskName(args);
    for (int i = 0; i < catalogNames.size(); i++) {
      for (int j = 0; j < INVALID_NAMES_STORE.length; j++) {
        if (catalogNames.get(i).toUpperCase().compareTo(INVALID_NAMES_STORE[j]) == 0) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * This function detect the catalog name between the bounds "\"
   * @param args arguments of the command line
   * @return Arraylist of catalogs
   */
  private ArrayList<String> findCatalogNamesIfPathStartsFromDiskName(String args) {
    int indexOfTheStartOfTheWord = 0;
    int indexOfTheEndOfTheWord = 0;
    ArrayList<String> catalogNames = new ArrayList<String>();
    for (int i = 2; i < args.length(); i++) {
      if (args.charAt(i) == '\\') {
        indexOfTheStartOfTheWord = i + 1;
        for (int j = i + 1; j < args.length(); j++) {
          if (args.charAt(j) == '\\') {
            indexOfTheEndOfTheWord = j;
            catalogNames.add((args.substring(indexOfTheStartOfTheWord,
                indexOfTheEndOfTheWord)).toUpperCase());
            break;
          }
        }
      }
    }
    return catalogNames;
  }

  /**
   * Check is path relative
   * @param args argument of the command line
   * @return true if path is relative.
   */
  private boolean isPathRelative(String args) {
    String catalogName = null;
    for (int i = 0; i < args.length(); i++) {
      if (args.charAt(i) == '\\') {
        catalogName = args.substring(0, i);
      }
    }
    isOnlyValidSymbols(catalogName);
    return true;
  }

  /**
   * Check is path contains only catalog and file names, and \ before it.
   * @param args argument of the command line.
   * @return true if path is relative.
   */
  private boolean isThisPathContainsOnlyCatalogAndFile(String args) {
    int count = 0;
    for (int i = 0; i < args.length(); i++) {
      if (args.charAt(i) == '\\') {
        count++;
      }
    }
    return count <= 1;
  }

  /**
   * Check is name of file is valid if this name is path with \ or not.
   * @param args argument of the command line
   * @return true if name is valid.
   */
  private boolean isFileNameValid(String args) {
    String fileName = "";
    char point = '.';
    int indexOfPoint = 0;
    if (args.charAt(0) == '\\') {
      args = args.substring(1, args.length());
    }
    for(char ch : args.toCharArray()){
      if (ch == point) {
        indexOfPoint = args.indexOf(ch);
      }
      fileName = args.substring(0, indexOfPoint);
    }
    for (int i = 0; i < INVALID_NAMES_STORE.length; i++) {
      if (fileName.compareTo(INVALID_NAMES_STORE[i]) == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * This function result all checking functions.
   * @param args arguments of the command line.
   * @return true if the path is valid and false otherwise.
   */
  public boolean isPathValid(String args) {
    if (isThisPathContainsOnlyCatalogAndFile(args)) {
      return(isFileNameValid(args) && isOnlyValidSymbols(args));
    } else if(isPathRelative(args)) {
      return(isOnlyValidNames(args) && isOnlyValidSymbols(args));
    }
    return((isStartSymbolsValid(args)) && isOnlyValidNames(args) && isOnlyValidSymbols(args));
  }
}