import java.util.ArrayList;
import java.util.List;

public class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {
        List<Integer> rect = new ArrayList<>();
        int area = lng * wdth;
        int x;
        for(int i = 1; area > 0; i++) {
            if(Math.pow(i, 2) >= area) {
                if(i == 1)
                    rect.add(i);
                else
                    rect.add(i - 1);
                area -= Math.pow(i - 1, 2);
                i = 1;
            }
        }
        return rect;
    }
}
