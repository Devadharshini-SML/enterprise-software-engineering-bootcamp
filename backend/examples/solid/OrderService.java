public class OrderService {

    private PaymentService paymentService;
    private EmailService emailService;
    private OrderRepository orderRepository;

    public OrderService(PaymentService paymentService, EmailService emailService, OrderRepository orderRepository) {
        this.paymentService = paymentService;
        this.emailService = emailService;
        this.orderRepository = orderRepository;
    }

    public void createOrder() {
        System.out.println("Order created");

        paymentService.processPayment();
        emailService.sendEmail();
        orderRepository.saveOrder();
    }
}
