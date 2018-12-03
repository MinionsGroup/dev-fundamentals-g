public class Game {

  private String word;
  private int chances;
  private StringBuilder wordRevealed;
  private StringBuilder wrongLetters;
  private final static String fileName = "movies.txt";

  public String getWord() {
    return word;
  }

  public String getWordRevealed() {
    return wordRevealed.toString();
  }

  public Game() {
    this.word = randomWord();
    this.wordRevealed = new StringBuilder(word.replaceAll("[a-zA-Z]", "_"));
    this.wrongLetters = new StringBuilder();
    this.chances = 10;
  }

  private String randomWord() {
    String[] words = Util.readWordsFromFile(fileName).split(System.lineSeparator());
    return words[(int) (Math.random() * words.length)];
  }

  public void insertChar(char character) {
    if (chances > 0) {
      for (int index = 0; index < this.word.length(); index++) {
        if (character == this.word.charAt(index)) {
          wordRevealed.setCharAt(index, character);
        }

      }
      if (!word.contains("" + character)) {
        wrongLetters.append(character);
        chances--;
      }
    }
  }

  public boolean isRevealed() {
    return this.word.equals(this.getWordRevealed());
  }

  public boolean finished() {
    return isRevealed() || this.chances == 0;
  }

  public String getWrongLetters() {
    return wrongLetters.toString();
  }
}