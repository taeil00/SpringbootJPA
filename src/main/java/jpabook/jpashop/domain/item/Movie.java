package jpabook.jpashop.domain.item;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Setter;
import lombok.Getter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class Movie extends Item {

    private String director;
    private String actor;

}
