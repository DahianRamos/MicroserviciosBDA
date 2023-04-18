package co.edu.uniquindio.biblioteca.servicio;
@Service
public class OpenFeignService {

        private final UserClient userClient;

        public UserService(UserClient userClient) {
            this.userClient = userClient;
        }

        public User getUserById(int id) {
            return userClient.getUserById(id);
        }
    }

