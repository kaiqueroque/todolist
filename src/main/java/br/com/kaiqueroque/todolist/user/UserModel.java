package br.com.kaiqueroque.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @Data Define os Getters and Setters automaticamente através do Lombok
 * @Getter Define os Getters automaticamente através do Lombok
 * @Setter Define os Setters automaticamente através do Lombok
 * Se inseridos acima da classe fará para todos os atributos, se inserido acima de um atributo, fará somente para ele.
 */
@Data
@Entity(name="tb_users")
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    //@Column(name = "usuario") caso eu queira mudar o nome da coluna no banco de dados
    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    //Getters and Setters viria aqui
    
}
