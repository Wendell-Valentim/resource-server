package io.github.cursodsousa.resourceserver;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class RSController {

    @GetMapping("/public")
    public ResponseEntity<String> pulicendPoint () {
        return ResponseEntity.ok("PUBBLIC ENDPOINT OK");
    }

    @GetMapping("/private")
    public ResponseEntity<String> privateendPoint () {
        return ResponseEntity.ok("PRIVATE ENDPOINT OK");
    }

    @GetMapping("/permissões")
    public ResponseEntity<Collection<? extends GrantedAuthority>> obterPermissoes(Authentication authentication) {
        return ResponseEntity.ok(authentication.getAuthorities());
    }
}
