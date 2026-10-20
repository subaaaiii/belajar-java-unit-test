package belajar.java.unit.test;

public class Calculator {
        public Integer add(Integer first, Integer second){
            return first+second;
        }
        public Integer divide(Integer first, Integer second){
            if(second ==0){
                throw new IllegalArgumentException("Cannot devide by zero");
            }else{
                return first/second;
            }
        }
}
