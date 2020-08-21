import java.util.Scanner;

public class Main {
    public static int gradeBest(int people,char[] farArray,char[] tailArray){
        char[] farTemp = new char[people];
        char[] tailTemp = new char[people];
        for(int i = 0;i < farArray.length;i++){
            if(farArray[i] == 'X'){
                break;
            }else{
                farTemp[i] = farArray[i];
            }
        }
        for(int i = 0;i < tailArray.length;i++){
            if(tailArray[i] == 'X'){
                break;
            }else{
                tailTemp[i] = tailArray[i];
            }
        }
        return countBest(farTemp,tailTemp)+1;
    }
    public static int gradeWorst(int people,char[] farArray,char[] tailArray){
        char[] farTemp = new char[people];
        char[] tailTemp = new char[people];
        for(int i = farArray.length-1;i >= 0;i--){
            if(farArray[i] == 'X'){
                break;
            }else{
                farTemp[i] = farArray[i];
            }
        }
        for(int i = tailArray.length-1;i >= 0;i--){
            if(tailArray[i] == 'X'){
                break;
            }else{
                tailTemp[i] = tailArray[i];
            }
        }
        return people - countWorse(farTemp,tailTemp);
    }

    public static int countBest(char[] farTemp,char[] tailTemp){
        int count = 0;
        int farLen = 0;
        int tailLen = 0;
        for(int i = 0;i < farTemp.length;i++){
            if(farTemp[i] != '\0'){
                farLen++;
            }else {
                continue;
            }
        }
        for(int i = 0;i < tailTemp.length;i++){
            if(tailTemp[i] != '\0'){
                tailLen++;
            }else {
                continue;
            }
        }
        for(int i = 0;i < farLen;i++){
            for(int j = 0;j < tailLen;j++){
                if(farTemp[i] == tailTemp[j]){
                    count++;
                    break;
                }else {
                    continue;
                }
            }
        }
        return count;
    }
    public static int countWorse(char[] farTemp,char[] tailTemp){
        int count = 0;
        int farLen = 0;
        int tailLen = 0;
        for(int i = 0;i < farTemp.length;i++){
            if(farTemp[i] != '\0'){
                farLen++;
            }else {
                continue;
            }
        }
        for(int i = 0;i < tailTemp.length;i++){
            if(tailTemp[i] != '\0'){
                tailLen++;
            }else {
                continue;
            }
        }
        for(int i = farTemp.length-1;i >= farTemp.length-farLen;i--){
            for(int j = tailTemp.length-1;j >= tailTemp.length-tailLen;j--){
                if(farTemp[i] == tailTemp[j]){
                    count++;
                    break;
                }else {
                    continue;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            int people = Integer.parseInt(str);
            String far = sc.nextLine();
            String tail = sc.nextLine();
            char[] farArray = far.toCharArray();
            char[] tailArray = tail.toCharArray();
            int best = gradeBest(people,farArray,tailArray);
            int worst = gradeWorst(people,farArray,tailArray);
            System.out.print(best+" ");
            System.out.print(worst);
        }
    }
}

