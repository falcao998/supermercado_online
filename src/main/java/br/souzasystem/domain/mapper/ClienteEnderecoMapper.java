package br.souzasystem.domain.mapper;

import br.souzasystem.domain.entity.ClienteEndereco;
import br.souzasystem.domain.request.ClienteEnderecoRequest;
import br.souzasystem.domain.response.ClienteEnderecoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClienteEnderecoMapper {

    ClienteEnderecoMapper INSTANCE = Mappers.getMapper( ClienteEnderecoMapper.class );

    ClienteEndereco requestToEntity(ClienteEnderecoRequest request);

    ClienteEnderecoResponse entityToResponse(ClienteEndereco entity);
}
