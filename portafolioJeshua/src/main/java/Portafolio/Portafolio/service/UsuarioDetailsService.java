/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Portafolio.Portafolio.service;

import org.springframework.security.core.userdetails.*;

/**
 *
 * @author jeshu
 */
public interface UsuarioDetailsService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
