package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //null 값 반환을 대비해 optional 로 감싸줌
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
