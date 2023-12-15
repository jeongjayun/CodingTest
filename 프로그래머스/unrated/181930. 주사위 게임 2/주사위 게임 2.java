class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
            
        if(1<=a && a<=6 && 1<=b && b<=6 && 1<=c && c<=6){
            
            if(a!=b && b!=c && a!=c){
                answer = a+b+c;
            }
            
            if(a==b){
                if(b==c){ // a,b,c 같을 때 
                    answer = (a+b+c) * (a*a+b*b+c*c) * (a*a*a+b*b*b+c*c*c);
                } else if (b!=c){ // a,b 같고 c 다를 때 
                    answer = (a+b+c) * (a*a+b*b+c*c);
                }
            } else if(a!=b){ 
                if(b==c){ // b,c 같고 a 다를 때 
                    answer = (a+b+c) * (a*a+b*b+c*c);
                } else if(a==c){ //a,c 같고 b 다를 때
                    answer = (a+b+c) * (a*a+b*b+c*c);
                }
            } 
        }
        
        return answer;
    }
}