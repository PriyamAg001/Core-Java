import java.util.Scanner;

public class arrangeInAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        for(int i=0; i<n; i++){
            names[i] = sc.nextLine();
        }

        String temp;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(names[i].compareTo(names[j]) > 0){
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(names[i]);
        }
    }
}
