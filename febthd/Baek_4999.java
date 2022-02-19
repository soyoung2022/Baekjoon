package febthd;

import java.io.*;

public class Baek_4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Boolean goOrNo = true;
        String canSpeak = br.readLine();
        String doctor = br.readLine();

        if(canSpeak.length() >= doctor.length()){
            for(int i = 0; i < canSpeak.length()-1; i++){
                if(canSpeak.charAt(i) != 'a'){
                    goOrNo = false;
                    break;
                }
            }
        } else{
            goOrNo = false;
        }

        bw.write(goOrNo ? "go" : "no");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
