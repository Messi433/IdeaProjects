package algorithmic;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/6/21 16:56
 * @Author 曹珂
 */
public class Test {

    public static void main(String[] args) {
        String resultMap = "{\"height\":\"180\",\"weight\":\"80\",\"heat\":\"36\",\"pulse\":\"30\",\"waistline\":\"80\",\"respiratory\":\"50\",\"leftshousuoya\":\"30\",\"leftshuzhangya\":\"40\",\"rightshousuoya\":\"50\",\"rightshuzhangya\":\"60\",\"bmi\":\"null\",\"lips\":\"DM100-10_5\",\"dentition\":\"DM100-11_3\",\"queChiLeftup\":\"que1\",\"queChiRightup\":\"que2\",\"queChiLeftdown\":\"que3\",\"queChiRightdown\":\"que4\",\"quChiLeftup\":\"qu1\",\"quChiRightup\":\"qu2\",\"quChiLeftdown\":\"qu3\",\"quChiRightdown\":\"qu4\",\"yiChiLeftup\":\"yi1\",\"yiChiRightup\":\"yi2\",\"yiChiLeftdown\":\"yi3\",\"yiChiRightdown\":\"yi4\",\"gorge\":\"DM100-12_3\",\"leftnaked\":\"4.4\",\"rightnaked\":\"4.6\",\"leftcorrect\":\"5.1\",\"rightcorrect\":\"5.2\",\"hearing\":\"DM100-13_2\",\"sportfunction\":\"DM100-14_2\",\"fundus\":\"DM100-15_2\",\"eyeExamination\":\"眼底异常描述\",\"skin\":\"DM100-36_6\",\"res0\":\"皮肤其他描述\",\"sclera\":\"DM100-36_99\",\"scleraElse\":\"巩膜其他描述\",\"lymphaden\":\"DM100-17_3\",\"lymphadenElse\":\"淋巴结其他描述\",\"chestBarrel\":\"DM01-10_2\",\"lungBreath\":\"DM100-15_2\",\"lungBreathDescription\":\"呼吸音异常描述\",\"lungRale\":\"DM100-18_9\",\"lungRaleDescription\":\"罗音其他描述\",\"heartRate\":\"30\",\"heartRateType\":\"DM100-19_3\",\"heartMurmur\":\"DM01-11_2\",\"heartmurmur\":\"杂音描述\",\"abdominalTenderness\":\"DM01-11_2\",\"tendernessDescription\":\"压痛描述\",\"abdominalMass\":\"DM01-11_2\",\"massDescription\":\"包块描述\",\"hepatomegaly\":\"DM01-11_2\",\"hepatomegalyDescription\":\"肝大描述\",\"splenomegaly\":\"DM01-11_2\",\"splenomegalyDescription\":\"脾大描述\",\"lungDullness\":\"DM01-11_2\",\"lungDullnessDescription\":\"移动性浊音描述\",\"legs\":\"DM100-20_3\",\"acrotarsium\":\"DM100-21_2\",\"anus\":\"DM100-22_9\",\"anusElse\":\"肛门指诊其他描述\",\"breast\":\"DM100-37_99\",\"breastElse\":\"乳腺其他描述\",\"vulva\":\"DM100-23_2\",\"vulvaDescription\":\"外阴异常描述\",\"vagina\":\"DM100-23_2\",\"vaginaDescription\":\"阴道异常描述\",\"cervical\":\"DM100-23_2\",\"cervixDescription\":\"宫颈异常描述\",\"uterus\":\"DM100-23_2\",\"uterusDescription\":\"宫体异常描述\",\"attachment\":\"DM100-23_2\",\"attachmentDescription\":\"附件异常描述\",\"hemoglobin\":\"1\",\"leukocyte\":\"1\",\"platelet\":\"1\",\"bloodElse\":\"1\",\"pro\":\"DM100-38_6\",\"glu\":\"DM100-38_6\",\"ket\":\"DM100-38_6\",\"ery\":\"DM100-38_6\",\"urineElse\":\"尿常规其他描述\",\"fbg\":\"1\",\"fbgDl\":\"1\",\"ecge\":\"DM100-15_2\",\"ecgDescription\":\"心电图异常描述\",\"malb\":\"1\",\"stoolBlood\":\"DM100-39_2\",\"hbalc\":\"1\",\"hbsag\":\"DM100-39_2\",\"serumAlt\":\"1\",\"ast\":\"1\",\"albumin\":\"1\",\"tbil\":\"1\",\"bilirubin\":\"1\",\"scr\":\"1\",\"bun\":\"1\",\"potassium\":\"1\",\"sodium\":\"1\",\"cholesterol\":\"1\",\"triglycerides\":\"1\",\"ldl\":\"1\",\"hdl\":\"1\",\"ecgsd\":\"DM213-01_9\",\"ecgDescriptionsd\":\"心电图其他描述\",\"xRay\":\"DM100-15_2\",\"xRayElse\":\"胸部X线片异常描述\",\"bComprehensive\":\"DM100-15_2\",\"bDescription\":\"腹部B超异常描述\",\"bDry\":\"DM100-15_2\",\"bBravery\":\"B超其他异常描述\",\"cervix\":\"DM100-15_2\",\"papsmear\":\"宫颈涂片异常描述\"}";

        String resultMapList = "[{'height':'171','weight':'80','waistline':null}," +
                "{'height':'180','weight':'90','waistline':null}]";

//        String obj = "{'name':'name0','age':0}";
//        String objList= "[{'name':'name0','age':0},{'name':'name1','age':2},]";

        List<Map<String, Object>> beanList = new ArrayList<>();

        /*JSONObject jsonObject = JSONObject.parseObject(result);
        System.out.println(result);
        System.out.println(jsonObject);
        System.out.println(jsonObject.getString("cervix"));*/
        /*Gson gson = new Gson();
        AioInter bean = gson.fromJson(resultMap, AioInter.class);//返回对象
        beanList = gson.fromJson(resultMapList, beanList.getClass());//返回对象集合
        System.out.println("打印对象" + bean);
        System.out.println("打印对象集合" + beanList);*/

        String jsonOri ="{\n" +
                "    \"data\": {\n" +
                "        \"cervix_DESCRIPTION\": null,\n" +
                "        \"vagina_DESCRIPTION\": null,\n" +
                "        \"uterus_DESCRIPTION\": null,\n" +
                "        \"attachment_DESCRIPTION\": null,\n" +
                "        \"ecg_DESCRIPTION_SD\": null,\n" +
                "        \"lung_BREATH_DESCRIPTION\": null,\n" +
                "        \"lung_RALE_DESCRIPTION\": null,\n" +
                "        \"abdominal_TENDERNESS\": null,\n" +
                "        \"tenderness_DESCRIPTION\": null,\n" +
                "        \"splenomegaly_DESCRIPTION\": null,\n" +
                "        \"hepatomegaly_DESCRIPTION\": null,\n" +
                "        \"lung_DULLNESS_DESCRIPTION\": null,\n" +
                "        \"rightshousuoya\": null,\n" +
                "        \"rightshuzhangya\": null,\n" +
                "        \"bmi\": null,\n" +
                "        \"lips\": null,\n" +
                "        \"dentition\": null,\n" +
                "        \"leftshuzhangya\": null,\n" +
                "        \"pulse\": null,\n" +
                "        \"waistline\": null,\n" +
                "        \"quechileftup\": null,\n" +
                "        \"weight\": \"71.45\",\n" +
                "        \"height\": \"140\",\n" +
                "        \"heat\": null,\n" +
                "        \"respiratory\": null,\n" +
                "        \"leftshousuoya\": null,\n" +
                "        \"quechirightdown\": null,\n" +
                "        \"yichileftup\": null,\n" +
                "        \"quchileftdown\": null,\n" +
                "        \"gorge\": null,\n" +
                "        \"leftnaked\": null,\n" +
                "        \"rightnaked\": null,\n" +
                "        \"leftcorrect\": null,\n" +
                "        \"rightcorrect\": null,\n" +
                "        \"yichirightdown\": null,\n" +
                "        \"sportfunction\": null,\n" +
                "        \"quechirightup\": null,\n" +
                "        \"hearing\": null,\n" +
                "        \"quchileftup\": null,\n" +
                "        \"yichileftdown\": null,\n" +
                "        \"quchirightup\": null,\n" +
                "        \"quchirightdown\": null,\n" +
                "        \"yichirightup\": null,\n" +
                "        \"quechileftdown\": null,\n" +
                "        \"res0\": null,\n" +
                "        \"chest_BARREL\": null,\n" +
                "        \"lymphaden\": null,\n" +
                "        \"fundus\": null,\n" +
                "        \"legs\": null,\n" +
                "        \"lymphaden_ELSE\": null,\n" +
                "        \"sclera_ELSE\": null,\n" +
                "        \"skin\": null,\n" +
                "        \"heart_MURMUR\": null,\n" +
                "        \"abdominal_MASS\": null,\n" +
                "        \"splenomegaly\": null,\n" +
                "        \"eye_EXAMINATION\": null,\n" +
                "        \"heart_RATE_TYPE\": null,\n" +
                "        \"lung_DULLNESS\": null,\n" +
                "        \"heartmurmur\": null,\n" +
                "        \"hepatomegaly\": null,\n" +
                "        \"sclera\": null,\n" +
                "        \"heart_RATE\": null,\n" +
                "        \"mass_DESCRIPTION\": null,\n" +
                "        \"acrotarsium\": null,\n" +
                "        \"lung_RALE\": null,\n" +
                "        \"lung_BREATH\": null,\n" +
                "        \"fbg_DL\": null,\n" +
                "        \"pro\": null,\n" +
                "        \"blood_ELSE\": null,\n" +
                "        \"anus_ELSE\": null,\n" +
                "        \"attachment\": null,\n" +
                "        \"breast\": null,\n" +
                "        \"ket\": null,\n" +
                "        \"ery\": null,\n" +
                "        \"hemoglobin\": null,\n" +
                "        \"urine_ELSE\": null,\n" +
                "        \"breast_ELSE\": null,\n" +
                "        \"vulva_DESCRIPTION\": null,\n" +
                "        \"platelet\": null,\n" +
                "        \"cervical\": null,\n" +
                "        \"glu\": null,\n" +
                "        \"vagina\": null,\n" +
                "        \"leukocyte\": null,\n" +
                "        \"vulva\": null,\n" +
                "        \"anus\": null,\n" +
                "        \"uterus\": null,\n" +
                "        \"fbg\": null,\n" +
                "        \"stool_BLOOD\": null,\n" +
                "        \"albumin\": null,\n" +
                "        \"bilirubin\": null,\n" +
                "        \"serum_ALT\": null,\n" +
                "        \"bun\": null,\n" +
                "        \"hdl\": null,\n" +
                "        \"ast\": null,\n" +
                "        \"hbsag\": null,\n" +
                "        \"malb\": null,\n" +
                "        \"cholesterol\": null,\n" +
                "        \"ecg_SD\": null,\n" +
                "        \"ecg_DESCRIPTION\": null,\n" +
                "        \"hbalc\": null,\n" +
                "        \"sodium\": null,\n" +
                "        \"x_RAY_ELSE\": null,\n" +
                "        \"triglycerides\": null,\n" +
                "        \"x_RAY\": null,\n" +
                "        \"potassium\": null,\n" +
                "        \"b_COMPREHENSIVE\": null,\n" +
                "        \"ldl\": null,\n" +
                "        \"b_DESCRIPTION\": null,\n" +
                "        \"ecg\": null,\n" +
                "        \"scr\": null,\n" +
                "        \"tbil\": null,\n" +
                "        \"b_DRY\": null,\n" +
                "        \"b_BRAVERY\": null,\n" +
                "        \"papsmear\": null,\n" +
                "        \"cervix\": null\n" +
                "    },\n" +
                "    \"errorMsg\": \"\",\n" +
                "    \"code\": \"0\"\n" +
                "}";
        //正则表达式解析
//        String pattern = "^\"data\".*:$}";
       /* String pattern = "\\d+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(jsonOri);
        if (m.find()){
            System.out.println(m);
        }*/
        String[] strs = jsonOri.split("[{}]");
        String newStr = "{"+strs[2]+"}";
        String replace = newStr.replace("", "");
        System.out.println(replace);

    }

}
