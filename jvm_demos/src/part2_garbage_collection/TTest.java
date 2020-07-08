package part2_garbage_collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname TTest
 * @Description TODO
 * @Date 2020/7/5 13:03
 * @Author 曹珂
 */
public class TTest {
    public static void main(String[] args) throws ParseException {
        /*try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String format = sdf.format(sdf.parse(medicalModel.getCreatetime()).getTime());
            medicalModel.setCreatetime(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
       /* SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Long timestamp = sdf.parse("2020-07-05 13:04:11").getTime();
        String format = sdf.format(timestamp);
        //2020-07-05 00:00:00 时间戳
        System.out.println(format);*/

        System.out.println(getSubDateString("2020-07-05 13:04:11")+" 00:00:00");
    }

    /**
     * 日期截取[去除时间部分]
     * 例如: 将2008-06-10 00:00:00.0 转换为 2008-06-10
     */
    public static String getSubDateString(String parDateString) {
        String str = "";
        if (parDateString.length() == 10) {
            return parDateString;
        }
        str = parDateString.substring(0, parDateString.indexOf(" "));
        return str;
    }
}
