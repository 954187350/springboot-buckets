package com.javaniuniu.generator.mapper;

import com.javaniuniu.generator.domain.Problem;
import com.javaniuniu.generator.domain.example.ProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProblemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated
     */
    long countByExample(ProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated
     */
    int deleteByExample(ProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated
     */
    int insert(Problem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated
     */
    int insertSelective(Problem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated
     */
    Problem selectOneByExample(ProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated
     */
    Problem selectOneByExampleSelective(@Param("example") ProblemExample example, @Param("selective") Problem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated
     */
    List<Problem> selectByExampleSelective(@Param("example") ProblemExample example, @Param("selective") Problem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated
     */
    List<Problem> selectByExample(ProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Problem record, @Param("example") ProblemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table problem
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Problem record, @Param("example") ProblemExample example);
}