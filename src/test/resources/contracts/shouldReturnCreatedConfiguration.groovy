import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return created configuration"
    request {
        method PUT()
        headers {
            contentType(applicationJsonUtf8())
        }
        url "/configuration/v1/key"
        body '''\
        {
            "chave": "configuracao.chave",
            "valor": "configuracao_valor"
        }
        '''
    }
    response {
        body '''\
        {
            "chave": "configuracao.chave",
            "valor": "configuracao_valor"
        }
        '''
        status 200
    }
}