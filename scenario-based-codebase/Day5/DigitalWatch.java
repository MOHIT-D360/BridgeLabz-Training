

class DigitalWatch {
    public static void main(String[] args) {
        int minutes =0;
        for(int hours =0;hours<24;hours++){
            for( minutes =0;minutes<60;minutes++){
                if(hours ==13 && minutes == 00){
                    System.out.println("Power cut !!!");
                    break;
                }
                
                System.out.printf("%d : %d \n",hours,minutes);
            }
             if(hours ==13 && minutes == 00){
                    
                    break;
                }
        }
    }
}