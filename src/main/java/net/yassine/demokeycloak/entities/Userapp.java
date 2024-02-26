package net.yassine.demokeycloak.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Userapp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private String firstName;
private String lastName;
private String Email;











}
