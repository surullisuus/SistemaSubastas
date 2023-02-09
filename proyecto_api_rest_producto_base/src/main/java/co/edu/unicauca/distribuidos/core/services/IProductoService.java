
package co.edu.unicauca.distribuidos.core.services;

import java.util.List;

import co.edu.unicauca.distribuidos.core.services.DTO.ProductoDTO;
import co.edu.unicauca.distribuidos.core.services.DTO.SubastaDTO;

public interface IProductoService {

	public List<ProductoDTO> findAll();

	public ProductoDTO findById(Integer id);

	public ProductoDTO save(ProductoDTO product); // registrar
        
        public ProductoDTO update(Integer id, ProductoDTO cliente);
       
        

}
