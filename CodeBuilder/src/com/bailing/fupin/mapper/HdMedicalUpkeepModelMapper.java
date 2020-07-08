package com.bailing.fupin.mapper;

import com.bailing.fupin.po.HdMedicalUpkeepModel;
import com.bailing.fupin.po.HdMedicalUpkeepModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HdMedicalUpkeepModelMapper {
    long countByExample(HdMedicalUpkeepModelExample example);

    int deleteByExample(HdMedicalUpkeepModelExample example);

    int deleteByPrimaryKey(String id);

    int insert(HdMedicalUpkeepModel record);

    int insertSelective(HdMedicalUpkeepModel record);

    List<HdMedicalUpkeepModel> selectByExample(HdMedicalUpkeepModelExample example);

    HdMedicalUpkeepModel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HdMedicalUpkeepModel record, @Param("example") HdMedicalUpkeepModelExample example);

    int updateByExample(@Param("record") HdMedicalUpkeepModel record, @Param("example") HdMedicalUpkeepModelExample example);

    int updateByPrimaryKeySelective(HdMedicalUpkeepModel record);

    int updateByPrimaryKey(HdMedicalUpkeepModel record);
}