public class task_3 {
    //3.2
     boolean Palindriom(String text){
        text = text.replaceAll(" ", "").toLowerCase();
        String textReverse = new StringBuilder(text).reverse().toString();
        return text.equals(textReverse);
    }
}


