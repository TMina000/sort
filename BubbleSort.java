import java.util.Scanner;

/**
 * バブルソート
 * 
 * コンパイル：javac -encoding UTF-8 .\BubbleSort.java
 * 実行方法：java BabbitSort
 */
class BabbitSort {

	public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("ソートしたい数字を入力してください。(入力終了はEnter)");
            System.out.println("例) > 1 2 10 3 39");
            System.out.print("> ");

            // 入力した数字を配列にする
            int[] array = makeArrayInt(scan);
            
            // 数字の配列をバブルソートする
            array = bubbleSort(array);

            for(int num: array){
                System.out.print(num + " ");
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
	}

    /**
     * 数字の配列を作成する関数
     * 
     * @param scan ソート対象の数字の標準入力
     * @return 数字の配列
     */
    private static int[] makeArrayInt(Scanner scan){
        String str = scan.nextLine();

        String[] array = str.split(" ");
        int[] arrayInt = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            arrayInt[i] = Integer.valueOf(array[i]);
        }
      
        return arrayInt;
    }

    /**
     * バブルソート
     * 
     * @param array ソートしたい配列
     * @return ソート結果
     */
    private static int[] bubbleSort(int[] array){
        
        for(int i = 0; i < array.length - i; i++){
            for(int j = 0; j < array.length - 1; j++){
                
                int left = array[j];
                int right = array[j + 1];
                int backup = 0;

                // 左、左+1(右)の値が左>右の場合、配列を入れ替える
                if(left > right){
                    backup = right;
                    array[j + 1] = left;
                    array[j] = backup;
                }
            }
        }
        
        return array;
    }
}