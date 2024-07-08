package br.souzasystem.domain.mapper;

import br.souzasystem.domain.entity.Cliente;
import br.souzasystem.domain.request.ClienteRequest;
import br.souzasystem.domain.response.ClienteResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {ClienteEnderecoMapper.class,
        ClientePagamentoMapper.class})
public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper( ClienteMapper.class );

    ClienteResponse entityToResponse(Cliente cliente);

    Cliente requestToEntity(ClienteRequest request);
}
