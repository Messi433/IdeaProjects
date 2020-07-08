package algorithmic;

import java.io.Serializable;

/**
 * @Classname AioInter
 * @Description 院内数据导入实体类
 * @Date 2020/6/21 20:48
 * @Author 曹珂
 */
public class AioInter implements Serializable {
    private String height;//身高
    private String weight;//体重
    private String waistline;//腰围
    private String heat;//体温
    private String pulse;//脉率
    private String respiratory;//呼吸频率
    private String leftShousuoya;//左侧收缩压
    private String leftShuzhangya;//左侧舒张压
    private String rightShousuoya;//右侧收缩压
    private String rightShuzhangya;//右侧收缩压
    private String bmi;//体质指数
    private String lips;//口唇
    private String dentition;//齿列
    private String queChiLeftup;//缺齿左上
    private String queChiRightup;//缺齿右上
    private String queChiLeftdown;//缺齿左下
    private String queChiRightdown;//缺齿右下
    private String quChiLeftup;//龋齿左上
    private String quChiRightup;//龋齿右上
    private String quChiLeftdown;//龋齿左下
    private String quChiRightdown;//龋齿右下
    private String yiChiLeftup;//义齿左上
    private String yiChiRightup;//义齿右上
    private String yiChiLeftdown;//义齿左下
    private String yiChiRightdown;//义齿右下
    private String gorge;//咽部
    private String leftNaked;//左眼
    private String rightNaked;//右眼
    private String leftCorrect;//矫正左眼
    private String rightCorrect;//矫正右眼
    private String hearing;//听力
    private String sportFunction;//运动功能
    private String fundus;//眼底
    private String eyeExamination;//眼底异常描述
    private String skin;//皮肤
    private String res0;//皮肤其他描述
    private String sclera;//巩膜
    private String scleraElse;//巩膜其他描述
    private String lymphaden;//淋巴结
    private String lymphadenElse;//淋巴结其他描述
    private String chestBarrel;//桶状胸
    private String lungBreath;//呼吸音
    private String lungBreathdescription;//呼吸音异常描述
    private String lungRale;//罗音
    private String lungRaleDescription;//罗音其他描述
    private String heartRate;//心率
    private String heartRateType;//心律
    private String heartMurmur;//杂音
    private String heartmurmur;//杂音描述
    private String abdominalTenderness;//压痛
    private String tendernessDescription;//压痛描述
    private String abdominalMass;//包块。
    private String massDescription;//包块描述
    private String hepatomegaly;//肝大
    private String hepatomegalyDescription;//肝大描述
    private String splenomegaly;//脾大
    private String splenomegalyDescription;//脾大描述
    private String lungDullness;//移动性浊音
    private String lungDullnessDescription;//移动性浊音描述
    private String legs;//下肢水肿
    private String acrotarsium;//足背动脉搏动
    private String anus;//肛门指诊
    private String anusElse;//肛门指诊其他描述
    private String breast;//乳腺
    private String breastElse;//乳腺其他描述
    private String vulva;//外阴
    private String vulvaDescription;//外阴异常描述
    private String vagina;//阴道
    private String vaginaDescription;//阴道异常描述
    private String cervical;//宫颈
    private String cervixDescription;//宫颈异常描述
    private String uterus;//宫体
    private String uterusDescription;//宫体异常描述
    private String attachment;//附件
    private String attachmentDescription;//附件异常描述
    private String hemoglobin;//血红蛋白
    private String leukocyte;//白细胞
    private String platelet;//血小板
    private String bloodElse;//血常规其他描述
    private String pro;//尿蛋白
    private String glu;//尿糖
    private String ket;//尿酮体
    private String ery;//尿潜血
    private String urineElse;//尿常规其他描述
    private String fbg;//空腹血糖
    private String fbgDl;//空腹血糖DL
    private String ecge;//心电图
    private String ecgDescription;//心电图异常描述
    private String malb;//尿微量白蛋白
    private String stoolBlood;//大便潜血
    private String hbalc;//糖化血红蛋白
    private String hbsag;//乙型肝炎表面抗原
    private String serumAlt;//血清谷丙转氨酶
    private String ast;//血清谷草转氨酶
    private String albumin;//白蛋白
    private String tbil;//总胆红素
    private String bilirubin;//结合胆红素
    private String scr;//血清肌配尸
    private String bun;//血尿素
    private String potassium;//血钾浓度
    private String sodium;//血钠浓度
    private String cholesterol;//总胆固醇
    private String triglycerides;//甘油三酯
    private String ldl;//血清低密度脂蛋白胆固醇
    private String hdl;//血清高密度脂蛋白胆固醇
    private String ecgsd;//心电图
    private String ecgdescriptionsd;//心电图其他描述
    private String xray;//胸部X线片
    private String lxRayElse;//胸部X线片异常描述
    private String bComprehensive;//腹部B超
    private String bDescription;//腹部B超异常描述
    private String bDry;//B超其他
    private String bBravery;//B超其他异常描述
    private String cervix;//宫颈涂片
    private String papsmear;//宫颈涂片异常描述

    @Override
    public String toString() {
        return "AioInter{" +
                "height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", waistline='" + waistline + '\'' +
                ", heat='" + heat + '\'' +
                ", pulse='" + pulse + '\'' +
                ", respiratory='" + respiratory + '\'' +
                ", leftShousuoya='" + leftShousuoya + '\'' +
                ", leftShuzhangya='" + leftShuzhangya + '\'' +
                ", rightShousuoya='" + rightShousuoya + '\'' +
                ", rightShuzhangya='" + rightShuzhangya + '\'' +
                ", bmi='" + bmi + '\'' +
                ", lips='" + lips + '\'' +
                ", dentition='" + dentition + '\'' +
                ", queChiLeftup='" + queChiLeftup + '\'' +
                ", queChiRightup='" + queChiRightup + '\'' +
                ", queChiLeftdown='" + queChiLeftdown + '\'' +
                ", queChiRightdown='" + queChiRightdown + '\'' +
                ", quChiLeftup='" + quChiLeftup + '\'' +
                ", quChiRightup='" + quChiRightup + '\'' +
                ", quChiLeftdown='" + quChiLeftdown + '\'' +
                ", quChiRightdown='" + quChiRightdown + '\'' +
                ", yiChiLeftup='" + yiChiLeftup + '\'' +
                ", yiChiRightup='" + yiChiRightup + '\'' +
                ", yiChiLeftdown='" + yiChiLeftdown + '\'' +
                ", yiChiRightdown='" + yiChiRightdown + '\'' +
                ", gorge='" + gorge + '\'' +
                ", leftNaked='" + leftNaked + '\'' +
                ", rightNaked='" + rightNaked + '\'' +
                ", leftCorrect='" + leftCorrect + '\'' +
                ", rightCorrect='" + rightCorrect + '\'' +
                ", hearing='" + hearing + '\'' +
                ", sportFunction='" + sportFunction + '\'' +
                ", fundus='" + fundus + '\'' +
                ", eyeExamination='" + eyeExamination + '\'' +
                ", skin='" + skin + '\'' +
                ", res0='" + res0 + '\'' +
                ", sclera='" + sclera + '\'' +
                ", scleraElse='" + scleraElse + '\'' +
                ", lymphaden='" + lymphaden + '\'' +
                ", lymphadenElse='" + lymphadenElse + '\'' +
                ", chestBarrel='" + chestBarrel + '\'' +
                ", lungBreath='" + lungBreath + '\'' +
                ", lungBreathdescription='" + lungBreathdescription + '\'' +
                ", lungRale='" + lungRale + '\'' +
                ", lungRaleDescription='" + lungRaleDescription + '\'' +
                ", heartRate='" + heartRate + '\'' +
                ", heartRateType='" + heartRateType + '\'' +
                ", heartMurmur='" + heartMurmur + '\'' +
                ", heartmurmur='" + heartmurmur + '\'' +
                ", abdominalTenderness='" + abdominalTenderness + '\'' +
                ", tendernessDescription='" + tendernessDescription + '\'' +
                ", abdominalMass='" + abdominalMass + '\'' +
                ", massDescription='" + massDescription + '\'' +
                ", hepatomegaly='" + hepatomegaly + '\'' +
                ", hepatomegalyDescription='" + hepatomegalyDescription + '\'' +
                ", splenomegaly='" + splenomegaly + '\'' +
                ", splenomegalyDescription='" + splenomegalyDescription + '\'' +
                ", lungDullness='" + lungDullness + '\'' +
                ", lungDullnessDescription='" + lungDullnessDescription + '\'' +
                ", legs='" + legs + '\'' +
                ", acrotarsium='" + acrotarsium + '\'' +
                ", anus='" + anus + '\'' +
                ", anusElse='" + anusElse + '\'' +
                ", breast='" + breast + '\'' +
                ", breastElse='" + breastElse + '\'' +
                ", vulva='" + vulva + '\'' +
                ", vulvaDescription='" + vulvaDescription + '\'' +
                ", vagina='" + vagina + '\'' +
                ", vaginaDescription='" + vaginaDescription + '\'' +
                ", cervical='" + cervical + '\'' +
                ", cervixDescription='" + cervixDescription + '\'' +
                ", uterus='" + uterus + '\'' +
                ", uterusDescription='" + uterusDescription + '\'' +
                ", attachment='" + attachment + '\'' +
                ", attachmentDescription='" + attachmentDescription + '\'' +
                ", hemoglobin='" + hemoglobin + '\'' +
                ", leukocyte='" + leukocyte + '\'' +
                ", platelet='" + platelet + '\'' +
                ", bloodElse='" + bloodElse + '\'' +
                ", pro='" + pro + '\'' +
                ", glu='" + glu + '\'' +
                ", ket='" + ket + '\'' +
                ", ery='" + ery + '\'' +
                ", urineElse='" + urineElse + '\'' +
                ", fbg='" + fbg + '\'' +
                ", fbgDl='" + fbgDl + '\'' +
                ", ecge='" + ecge + '\'' +
                ", ecgDescription='" + ecgDescription + '\'' +
                ", malb='" + malb + '\'' +
                ", stoolBlood='" + stoolBlood + '\'' +
                ", hbalc='" + hbalc + '\'' +
                ", hbsag='" + hbsag + '\'' +
                ", serumAlt='" + serumAlt + '\'' +
                ", ast='" + ast + '\'' +
                ", albumin='" + albumin + '\'' +
                ", tbil='" + tbil + '\'' +
                ", bilirubin='" + bilirubin + '\'' +
                ", scr='" + scr + '\'' +
                ", bun='" + bun + '\'' +
                ", potassium='" + potassium + '\'' +
                ", sodium='" + sodium + '\'' +
                ", cholesterol='" + cholesterol + '\'' +
                ", triglycerides='" + triglycerides + '\'' +
                ", ldl='" + ldl + '\'' +
                ", hdl='" + hdl + '\'' +
                ", ecgsd='" + ecgsd + '\'' +
                ", ecgdescriptionsd='" + ecgdescriptionsd + '\'' +
                ", xray='" + xray + '\'' +
                ", lxRayElse='" + lxRayElse + '\'' +
                ", bComprehensive='" + bComprehensive + '\'' +
                ", bDescription='" + bDescription + '\'' +
                ", bDry='" + bDry + '\'' +
                ", bBravery='" + bBravery + '\'' +
                ", cervix='" + cervix + '\'' +
                ", papsmear='" + papsmear + '\'' +
                '}';
    }
}
