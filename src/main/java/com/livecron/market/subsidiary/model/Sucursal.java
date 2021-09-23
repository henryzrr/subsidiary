/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.subsidiary.dto.SucursalDto;

import java.util.Set;

@Getter
@Setter
@Entity
public class Sucursal extends ModelBase<SucursalDto> {

    private String codigo;
    private String nombre;
    private String telefono;

    @OneToMany(mappedBy = "sucursal")
    private Set<Inventario> inventarios;
}
