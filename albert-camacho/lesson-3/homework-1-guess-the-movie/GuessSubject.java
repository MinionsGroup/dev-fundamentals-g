import java.util.List;

public class GuessSubject {
    private List<String> subjects;
    private String subject;
    private StringBuilder guessedSubject;

    public GuessSubject(List<String> subjects) {
        this.subjects = subjects;
        load();
    }

    public void load() {
        this.subject = GuessUtil.selectSubject(subjects);
        this.guessedSubject = new StringBuilder(subject.replaceAll("[\\w]", "_"));
    }

    public String getSubject() {
        return subject;
    }

    public String getGuessedSubject() {
        return guessedSubject.toString();
    }

    public boolean contains(char letter) {
        boolean guessed = false;
        for (int i = 0; i < subject.length(); i++) {
            if (subject.charAt(i) == letter) {
                guessedSubject.replace(i, i+1, String.valueOf(letter));
                guessed = true;
            }
        }
        return guessed;
    }

    public boolean guessCompleted(){
        return subject.equals(guessedSubject.toString());
    }
}
