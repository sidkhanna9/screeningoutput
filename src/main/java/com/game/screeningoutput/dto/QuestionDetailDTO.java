package com.game.screeningoutput.dto;

import java.util.List;

public class QuestionDetailDTO {


    private String questionId;
    private String name;
    private String content;
//    private List<OptionDTO> optionDTOList;
//    private List<OptionDTO> correctDTOList;
    private String optionList;
    private String correctOptionList;
    private String category;
    private String mediaType;
    private String ansType;
    private String difficulty;
    private int duration;


    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOptionList() {
        return optionList;
    }

    public void setOptionList(String optionList) {
        this.optionList = optionList;
    }

    public String getCorrectOptionList() {
        return correctOptionList;
    }

    public void setCorrectOptionList(String correctOptionList) {
        this.correctOptionList = correctOptionList;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getAnsType() {
        return ansType;
    }

    public void setAnsType(String ansType) {
        this.ansType = ansType;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }





}
