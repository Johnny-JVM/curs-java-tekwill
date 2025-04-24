package homework13Massiv;

public class Main3 {
    public static void main(String[] args) {
        int[] OriginArray = {3, 5, 7, 9, 11};
        int[] CopyArray = new int[OriginArray.length];

        for (int i = 0; i < OriginArray.length; i++){
            CopyArray[i] = OriginArray[i];
        }
        System.out.println("Скопированный массив должен быть внизу");
        for (int num : CopyArray){
            System.out.print(num + " ");
        }
    }
}
