package com.cloud.proxy.rest

import com.cloud.proxy.CloudPogo
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.client.RestTemplate

/**
 * Created by marcelo.fontes on 08/11/16.
 */
@Slf4j
@org.springframework.web.bind.annotation.RestController
class RestProxy {
    @Autowired
    RestTemplate template

    @RequestMapping(value = '/proxy', method = RequestMethod.POST, consumes = 'application/json')
    def subscribe(@RequestBody final Map body) {
        def url = "http://${body.service}/${body.action}"

        log.info "Proxy Redirect to ${url}"

        template.postForObject new URI(url), body, String
    }
}