public class Main {
    public static void main(String[] args) {
        //Вариант №5 Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида:
        // «Название книги» И.О.Автора.
        String[][] library = {{"War and Peace", "Lev Nikolaevich Tolstoy"}, {"Reach father, poor father", "Paolo Coelho Sauza"}};
        for (int i = 0; i < library.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < library[i].length; j++) {
                if (j == 0) {
                    stringBuilder.append('"' + library[i][j] + "\" ");
                } else {
                    String s = library[i][j];
                    String[] temp = s.split(" ");
                    for (int k = 0; k < temp.length; k++) {
                        if (k == temp.length - 1) {
                            stringBuilder.append(temp[k]);
                        } else {
                            String word = temp[k];
                            char firstChar = word.charAt(0);
                            stringBuilder.append(firstChar + ".");
                        }
                    }
                }
            }
            System.out.println(stringBuilder);
        }
    }
}