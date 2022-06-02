package com.arcreane.entity;

public class Movie {
    private String m_sTitle;
    private String m_sType;

    public Movie() {
    }
    public Movie(String m_sTitle, String m_sType) {
        this.m_sTitle = m_sTitle;
        this.m_sType = m_sType;
    }

    public String getM_sType() {
        return m_sType;
    }
    public void setM_sType(String m_sType) {
        this.m_sType = m_sType;
    }

    public String getTitle() {
        return m_sTitle;
    }

    public void setM_sTitle(String m_sTitle) {
        this.m_sTitle = m_sTitle;
    }

    @Override
    public String toString() {
        return m_sTitle+";"+m_sType;
    }
}
