

//Controller

@RestController
public class ForgetPasswordController {

    @Autowired
    private ForgetPasswordService forgetPasswordService;

    @PostMapping("/forgetpassword")
    public ResponseEntity<Object> resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest) {
        forgetPasswordService.resetPassword(resetPasswordRequest);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}

//Service

@Service
public class ForgetPasswordService {

    @Autowired
    private ForgetPasswordRepository forgetPasswordRepository;

    public void resetPassword(ResetPasswordRequest resetPasswordRequest) {
        forgetPasswordRepository.resetPassword(resetPasswordRequest);
    }

}

//Repository

@Repository
public interface ForgetPasswordRepository {

    void resetPassword(ResetPasswordRequest resetPasswordRequest);

}