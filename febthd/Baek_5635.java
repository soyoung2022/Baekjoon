package febthd;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_5635 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        String name[];
        int date[], month[], year[];
        n = Integer.parseInt(br.readLine());
        name = new String[n];
        date = new int[n];
        month = new int[n];
        year = new int[n];

        int minIndex = 0, maxIndex = 0;
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            name[i] = st.nextToken();
            date[i] = Integer.parseInt(st.nextToken());
            month[i] = Integer.parseInt(st.nextToken());
            year[i] = Integer.parseInt(st.nextToken());
            if(year[i] > year[minIndex]){
                minIndex = i;
            } else if(year[i] == year[minIndex]){
                if(month[i] > month[minIndex]){
                    minIndex = i;
                } else if(month[i] == month[minIndex]){
                    if(date[i] > date[minIndex]){
                        minIndex = i;
                    }
                }
            }
            if(year[i] < year[maxIndex]){
                maxIndex = i;
            } else if(year[i] == year[maxIndex]){
                if(month[i] < month[maxIndex]){
                    maxIndex = i;
                } else if(month[i] == month[maxIndex]){
                    if(date[i] < date[maxIndex]){
                        maxIndex = i;
                    }
                }
            }
        }

        bw.write(name[minIndex]);
        bw.newLine();
        bw.write(name[maxIndex]);
        bw.flush();
        bw.close();
    }
}
