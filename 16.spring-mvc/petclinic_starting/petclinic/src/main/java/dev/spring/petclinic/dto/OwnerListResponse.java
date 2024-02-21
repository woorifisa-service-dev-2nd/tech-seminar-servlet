package dev.spring.petclinic.dto;

import dev.spring.petclinic.model.Owner;
import dev.spring.petclinic.model.Pet;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ownerListDTO {
    private List<OwnerDTO> owners;

    public ownerListDTO(List<Owner> owners) {
//        List<OwnerDTO> ownerList = new ArrayList<>();
//        for(Owner owner:owners){
//            ownerList.add(new OwnerDTO(owner));
//        }
//        this.owners = ownerList;
        this.owners = owners.stream().map(OwnerDTO::new).collect(Collectors.toList());
    }

}
