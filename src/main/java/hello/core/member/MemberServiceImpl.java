package hello.core.member;

public class MemberServiceImpl implements MemberService{

    //null이 있을 경우 구현객체 선택해 줘야 해서 memorymemberrepository
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
