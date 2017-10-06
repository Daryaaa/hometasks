import java.util.HashMap;

public class EnterPoint {
  public static void main(String[] args) {
    Transliteration example = new Transliteration();
    //Creative vocabularies
    HashMap<String, String> vocabularyEN_RU = new HashMap<>();
    HashMap<String, String> vocabularyRU_EN_complexSimbols = new HashMap<>();
    HashMap<String, String> vocabularyEN_RU_complexSymbols = new HashMap<>();
    HashMap<String, String> vocabularyRU_EN = new HashMap<>();
    //initialize vocabularies
    example.inicializationEN_RU(vocabularyEN_RU);
    example.inicializationEN_RU(vocabularyEN_RU_complexSymbols);
    example.initializationRU_EN(vocabularyRU_EN);
    example.initializationRU_EN_complexSymbols(vocabularyRU_EN_complexSimbols);

    System.out.println(example.convert("apple ceese chees bebebeya", vocabularyEN_RU_complexSymbols, vocabularyEN_RU));
  }
}
