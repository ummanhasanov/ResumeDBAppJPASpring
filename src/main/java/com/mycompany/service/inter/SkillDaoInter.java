/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.inter;

import com.mycompany.entity.Skill;

import java.util.List;

/**
 *
 * @author Umman Hasan
 */
public interface SkillDaoInter
{
    
    public List<Skill> getAllSkill();
    public boolean insertSkill( Skill name);
    
}
