package com.arcreane.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private
    @Getter
    @Setter
    String m_sTitle;
    private
    @Getter
    @Setter
    String m_sType;

    @Override
    public String toString() {
        return m_sTitle + ";" + m_sType;
    }
}
