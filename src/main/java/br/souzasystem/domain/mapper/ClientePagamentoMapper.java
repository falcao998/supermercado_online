package br.souzasystem.domain.mapper;

import br.souzasystem.domain.entity.ClientePagamento;
import br.souzasystem.domain.request.ClientePagamentoRequest;
import br.souzasystem.domain.response.ClientePagamentoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClientePagamentoMapper {

    ClientePagamentoMapper INSTANCE = Mappers.getMapper(ClientePagamentoMapper.class);

    ClientePagamentoResponse entityToResponse(ClientePagamento entity);

    ClientePagamento RequestToEntity(ClientePagamentoRequest request);
}
