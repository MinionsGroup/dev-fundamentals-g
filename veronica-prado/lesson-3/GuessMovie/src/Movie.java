import java.util.Arrays;

public class Movie {
    private String title;
    private String titleGues;

    public void setTitle(String title){
        this.title = title;
        char [] titleTemp = new char[title.length()];
        Arrays.fill(titleTemp,'_'); //fill with character _
        this.titleGues = new String(titleTemp);//titleTemp.toString();
        replaceTitleGuesWithCharacter(' ');
    }

    public void replaceTitleGuesWithCharacter(char c){
        char [] newTitle = titleGues.toCharArray();
        for(int position=0; position < title.length(); position++){
            if(title.charAt(position) == c){
                newTitle[position] = c;
            }
        }
        titleGues = String.valueOf(newTitle);
    }

    public  boolean isLetterInTitle(char letter){
        if (title.contains(String.valueOf(letter))){
            if(!titleGues.contains(String.valueOf(letter))){
                replaceTitleGuesWithCharacter(letter);
                //titleGues.replace('_', letter);
                return true;
            }
        }

        return false;
    }

    public String getTitleGues(){
        return titleGues;
    }

    public String getTitle(){
        return title;
    }

    public boolean IsTitleGuessed(){
        return (title.compareTo(titleGues) ==0);
    }
}
