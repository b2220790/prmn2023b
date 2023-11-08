package lecture2;

public class keisan {
    void tasizan(int[] b){
        int sum = 0;
        for(int i = 0;i < 5;i++){
            sum = sum + b[i];
            
        }
        System.out.println("和は" +sum);
        if(sum<=49){
            System.out.println("small");
        } else if (sum >= 100) {
            System.out.println("great!");
        }
        else{
            System.out.println("big");
        }
    }
    
}
