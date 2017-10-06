import java.util.HashMap;

public class Transliteration {

  HashMap<String, String> vocabulary = new HashMap<>();
  /**
   * Initialization vocabulary single symbols from latin to cyrilic
   * @return vocabulary with symbols in haspmap form.
   */
  private HashMap<String, String> initializationEN_RU() {
    vocabulary.put("a", "а");
    vocabulary.put("b", "б");
    vocabulary.put("v", "в");
    vocabulary.put("g", "г");
    vocabulary.put("d", "д");
    vocabulary.put("e", "е");
    vocabulary.put("z", "з");
    vocabulary.put("i", "и");
    vocabulary.put("y", "й");
    vocabulary.put("k", "к");
    vocabulary.put("l", "л");
    vocabulary.put("m", "м");
    vocabulary.put("n", "н");
    vocabulary.put("o", "о");
    vocabulary.put("p", "п");
    vocabulary.put("r", "р");
    vocabulary.put("s", "с");
    vocabulary.put("t", "т");
    vocabulary.put("u", "у");
    vocabulary.put("f", "ф");
    vocabulary.put("A", "А");
    vocabulary.put("B", "Б");
    vocabulary.put("V", "В");
    vocabulary.put("G", "Г");
    vocabulary.put("D", "Д");
    vocabulary.put("E", "Е");
    vocabulary.put("Z", "З");
    vocabulary.put("I", "И");
    vocabulary.put("Y", "Й");
    vocabulary.put("K", "К");
    vocabulary.put("L", "Л");
    vocabulary.put("M", "М");
    vocabulary.put("N", "Н");
    vocabulary.put("O", "О");
    vocabulary.put("P", "П");
    vocabulary.put("R", "Р");
    vocabulary.put("S", "С");
    vocabulary.put("T", "Т");
    vocabulary.put("U", "У");
    vocabulary.put("F", "Ф");
    return vocabulary;
  }

  /**
   * Initialization vocabulary for several symbols, the order of that matters, from latin to cyrilic
   * @return vocabulary with symbols in haspmap form.
   */
  private HashMap<String, String> initializationEN_RU_complexSymbols() {
    vocabulary.put("OJSC", "ОАО");
    vocabulary.put("CJSC", "ЗАО");
    vocabulary.put("LLC", "ООО");
    vocabulary.put("Ltd.", "ООО");
    vocabulary.put("SRL", "ООО");
    vocabulary.put("Fund", "фонд");
    vocabulary.put("SEE", "ГОУ");
    vocabulary.put("MEE", "МОУ");
    vocabulary.put("NEE", "НОУ");
    vocabulary.put("union", "союз");
    vocabulary.put("Union", "Союз");
    vocabulary.put("eyeye", "еее");
    vocabulary.put("shch", "щ");
    vocabulary.put("Shch", "Щ");
    vocabulary.put("yuye", "юе");
    vocabulary.put("Yuye", "Юе");
    vocabulary.put("yaye", "яе");
    vocabulary.put("Yaye", "Яе");
    vocabulary.put("aye", "ае");
    vocabulary.put("Aye", "Ае");
    vocabulary.put("eye", "ее");
    vocabulary.put("Eye", "Ее");
    vocabulary.put("iye", "ие");
    vocabulary.put("Iye", "Ие");
    vocabulary.put("oye", "ое");
    vocabulary.put("Oye", "Ое");
    vocabulary.put("uye", "уе");
    vocabulary.put("Uye", "Уе");
    vocabulary.put("yye", "ые");
    vocabulary.put("ye", "ье");
    vocabulary.put("ia", "ья");
    vocabulary.put("iy", "ий");
    vocabulary.put("Iy", "Ий");
    vocabulary.put("zh", "ж");
    vocabulary.put("Zh", "Ж");
    vocabulary.put("kh", "х");
    vocabulary.put("Kh", "Х");
    vocabulary.put("ts", "ц");
    vocabulary.put("Ts", "Ц");
    vocabulary.put("ch", "ч");
    vocabulary.put("Ch", "Ч");
    vocabulary.put("sh", "ш");
    vocabulary.put("Sh", "Ш");
    vocabulary.put("yu", "ю");
    vocabulary.put("Yu", "Ю");
    vocabulary.put("ya", "я");
    vocabulary.put("Ya", "Я");
    return vocabulary;
  }

  /**
   * Initialization vocabulary single symbols from cyrylic ti latin
   * @return vocabulary with symbols in haspmap form.
   */
  private HashMap<String, String> initializationRU_EN() {
    vocabulary.put("А", "A");
    vocabulary.put("Б", "B");
    vocabulary.put("В", "C");
    vocabulary.put("Г", "G");
    vocabulary.put("Д", "D");
    vocabulary.put("Е", "E");
    vocabulary.put("Ё", "E");
    vocabulary.put("Ж", "Zh");
    vocabulary.put("З", "Z");
    vocabulary.put("И", "I");
    vocabulary.put("Й", "Y");
    vocabulary.put("К", "K");
    vocabulary.put("Л", "L");
    vocabulary.put("М", "M");
    vocabulary.put("Н", "N");
    vocabulary.put("О", "O");
    vocabulary.put("П", "P");
    vocabulary.put("Р", "R");
    vocabulary.put("С", "S");
    vocabulary.put("Т", "T");
    vocabulary.put("У", "U");
    vocabulary.put("Ф", "F");
    vocabulary.put("Х", "Kh");
    vocabulary.put("Ц", "Ts");
    vocabulary.put("Ч", "Ch");
    vocabulary.put("Ш", "Sh");
    vocabulary.put("Щ", "Shch");
    vocabulary.put("Ы", "Y");
    vocabulary.put("Э", "E");
    vocabulary.put("Ю", "Yu");
    vocabulary.put("Я", "Ya");
    vocabulary.put("а", "a");
    vocabulary.put("б", "b");
    vocabulary.put("в", "v");
    vocabulary.put("г", "g");
    vocabulary.put("д", "d");
    vocabulary.put("е", "e");
    vocabulary.put("ё", "e");
    vocabulary.put("ж", "zh");
    vocabulary.put("з", "z");
    vocabulary.put("и", "i");
    vocabulary.put("й", "y");
    vocabulary.put("к", "k");
    vocabulary.put("л", "l");
    vocabulary.put("м", "m");
    vocabulary.put("н", "n");
    vocabulary.put("о", "o");
    vocabulary.put("п", "p");
    vocabulary.put("р", "r");
    vocabulary.put("с", "s");
    vocabulary.put("т", "t");
    vocabulary.put("у", "u");
    vocabulary.put("ф", "f");
    vocabulary.put("х", "kh");
    vocabulary.put("ц", "ts");
    vocabulary.put("ч", "ch");
    vocabulary.put("ш", "sh");
    vocabulary.put("щ", "shch");
    vocabulary.put("ы", "y");
    vocabulary.put("э", "e");
    vocabulary.put("ю", "yu");
    vocabulary.put("я", "ya");
    return vocabulary;
  }

  /**
   * Initialization vocabulary  for several symbols, the order of that matters, from cyrilic to latin
   * @return vocabulary with symbols in haspmap form.
   */
  private HashMap<String, String> initializationRU_EN_complexSymbols() {
    vocabulary.put("ОАО", "OJSC");
    vocabulary.put("ЗАО", "CJSC");
    vocabulary.put("ООО", "LLC");
    vocabulary.put("фонд", "Fund");
    vocabulary.put("ГОУ", "SEE");
    vocabulary.put("МОУ", "MEE");
    vocabulary.put("НОУ", "NEE");
    vocabulary.put("союз", "union");
    vocabulary.put("Союз", "Union");
    vocabulary.put("ья", "ia");
    vocabulary.put("ае", "aye");
    vocabulary.put("Ае", "Aye");
    vocabulary.put("ее", "eye");
    vocabulary.put("Ее", "Eye");
    vocabulary.put("ие", "iye");
    vocabulary.put("Ие", "Iye");
    vocabulary.put("ое", "oye");
    vocabulary.put("Ое", "Oye");
    vocabulary.put("уе", "uye");
    vocabulary.put("Уе", "Uye");
    vocabulary.put("ъе", "ye");
    vocabulary.put("ые", "yye");
    vocabulary.put("ье", "ye");
    vocabulary.put("эе", "eye");
    vocabulary.put("Эе", "Eye");
    vocabulary.put("юе", "yuye");
    vocabulary.put("Юе", "Yuye");
    vocabulary.put("яе", "yaye");
    vocabulary.put("Яе", "Yaye");
    vocabulary.put("аё", "aye");
    vocabulary.put("её", "eye");
    vocabulary.put("Её", "Eye");
    vocabulary.put("иё", "iye");
    vocabulary.put("оё", "oye");
    vocabulary.put("Оё", "Oye");
    vocabulary.put("уё", "uye");
    vocabulary.put("Уё", "Uye");
    vocabulary.put("ъё", "ye");
    vocabulary.put("ыё", "yye");
    vocabulary.put("ьё", "ye");
    vocabulary.put("эё", "eye");
    vocabulary.put("юё", "yuye");
    vocabulary.put("яё", "yaye");
    vocabulary.put("ий", "iy");
    vocabulary.put("ый", "iy");
    return vocabulary;
  }

  /**
   * This method find out lenguage of input text.
   * @param text - input text
   * @return true - in latin, false - in cyrilic.
   */
  private boolean isTextLatin(String text) {
    String textLowCase = text.toLowerCase();
     return (textLowCase.charAt(0) >= 97 && textLowCase.charAt(0) <= 122);
  }

  /**
   * Convert string in translit if it input in russian and vice versa.
   * @param text is input text.
   * @return conver string.
   */
  public String convert(String text) {
    if(isTextLatin(text)) {
      HashMap<String, String> vocabularyComplex = initializationEN_RU_complexSymbols();
      HashMap<String, String> vocabulary = initializationEN_RU();
      for(String value : vocabularyComplex.keySet()) {
        text = text.replace(value, vocabularyComplex.get(value));
      }
      for(String value : vocabulary.keySet()) {
          text = text.replace(value, vocabulary.get(value));
      }
    } else {
      HashMap<String, String> vocabularyComplex = initializationRU_EN_complexSymbols();
      HashMap<String, String> vocabulary = initializationRU_EN();
      for(String value : vocabularyComplex.keySet()) {
        text = text.replace(value, vocabularyComplex.get(value));
      }
      for(String value : vocabulary.keySet()) {
        text = text.replace(value, vocabulary.get(value));
      }
    }
    return text;
  }
}