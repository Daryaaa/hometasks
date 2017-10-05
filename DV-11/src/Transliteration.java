import java.util.HashMap;

public class Transliteration {

  /**
   * This method find out lenguage of input text.
   * @param text - input text
   * @return true if it translit text, false - russian.
   */
  private boolean knowInputLanguage(String text) {
    String textLowCase = text.toLowerCase();
    if(textLowCase.charAt(0) >= 97 && textLowCase.charAt(0) <= 122) {
      return true;
    }
    else return false;
  }
  /**
   * Convert string in translit if it input in russian and vice versa.
   * @param text is input text.
   * @param vocabularyComplex is vocablulary for several symbols, the order of that matters.
   * @param vocabulary is vocablulary single simbols.
   * @return conver string.
   */

  public String convert(String text, HashMap<String, String> vocabularyComplex,
                        HashMap<String,String> vocabulary) {
    if(knowInputLanguage(text)) {
      for(String value : vocabularyComplex.keySet()){
        text = text.replace(value, vocabularyComplex.get(value));
      }
      for(String value : vocabulary.keySet()) {
          text = text.replace(value, vocabulary.get(value));
      }

    } else {
      for(String value : vocabularyComplex.keySet()){
        text = text.replace(value, vocabularyComplex.get(value));
      }
      for(String value : vocabulary.keySet()) {
        text = text.replace(value, vocabulary.get(value));
      }
    }
      return text;
  }
}