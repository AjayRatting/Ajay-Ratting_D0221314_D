if(N%2==1){
            System.out.println("Weird");
        }else{//EVEN
            if(2 <= N && N<=5){
                System.out.println("Not Weird");
            }else if(6 <= N && N<=20){
                System.out.println("Weird");
            }else if(N>20){
                System.out.println("Not Weird");
            }
        }
    }
}

