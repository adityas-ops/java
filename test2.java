class tapeRecorder{
    boolean canRecord = false;
    void playTape(){
        System.out.println("Playing tape");
    }
    void recordTape(){
        System.out.println("Recording tape");
    }
}



public class test2 {
    public static void main(String [] args){
        tapeRecorder tape = new tapeRecorder();
        tape.canRecord = true;
        tape.recordTape();
    }
}
