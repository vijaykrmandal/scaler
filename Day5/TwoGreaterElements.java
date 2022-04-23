package Day5;

public class TwoGreaterElements {
    public static void main(String[] args) {
        int A [] = {391, 634, 740, 441, 75, 444, 65, 611, 679, 59, 878, 102, 42, 190, 801, 571, 79, 686, 523, 580, 199, 497, 879, 334, 200, 202, 991, 341, 479, 563, 112, 550, 494, 468, 56, 644, 53, 581, 836, 461, 905, 849, 838, 434, 818, 350, 585, 280, 252, 834, 510, 420, 395, 776, 118, 886, 19, 809, 534, 143, 933, 15, 999, 514, 230, 531, 666, 841, 861, 703, 972, 622, 640, 21, 811, 476, 751, 430, 308, 996, 165, 812, 424, 412, 903, 601, 226, 239, 728, 135 };
        int B[]=new int [A.length];
        int lengthB=0;
        int count=0;
        for(int i=0;i<A.length;i++){
            count=0;
            for(int j=0;j<A.length;j++){
                if(A[j]>A[i]){count ++;}
                if(count==2) break;
            }
            if(count==2){
                B[lengthB++]=A[i];
            }
            
        }
        System.out.println(lengthB);
        int result[]=new int[lengthB];
        for(int i=0;i<lengthB;i++){
            if(B[i]!=0){
                result[i]=B[i];
            }
        }
        for(int i=0;i<lengthB;i++){
            System.out.print(B[i]+", ");
        }
    }
}
