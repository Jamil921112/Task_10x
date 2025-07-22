package ex_15_Arrays;

public class Lab_69_Array_Max_value_Interview {
    public static void main(String[] args) {
        int []array ={22,14,56,85,77,69,23,};//
            // mAX , MIN
        //lOGIC building
        // 1 -> inputs -array -->int
        // output -> int -77
        int max_output = give_max(array);
        System.out.println(max_output);
        int min_output =  give_min(array);
        System.out.println(min_output);

    }
    static int give_max (int []array){
       int max = array[0];//25
        //Logic
       for(int i =0 ;i < array.length ; i++){
           if(array[i] > max){
               max =array[i];
           }

       }
       return max;

    }
    static int give_min (int[]array){
       int min = array[0];
       for (int i = 0; i <array.length; i++){
           if(array[i] < min ){
               min = array [i];
           }
       }
       return  min;
    }
}
