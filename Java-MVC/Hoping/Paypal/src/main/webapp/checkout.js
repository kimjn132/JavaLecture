paypal.Button.render({
		env : 'sandbox', // 테스트용은 'sandbox'를, 운영은 'production'을 입력
		client : {
			sandbox : 'paypal-sandbox-key', // paypal에서 발급 받은 client_key를 입력
			production : 'paypal-production-key'
		},
		payment : function() {
			var env = this.props.env;
			var client = this.props.client;
			return paypal.rest.payment.create(env, client, {
				transactions : [ {
					amount : {
						total : '10.00',
						currency : 'USD'
					}
				} ],
			});
		},
		commit : true,
		// false일 시 모달의 마지막 버튼의 문구가 Continue로 변하고 바로 결제가 진행되는 것이 아니라 리다이렉트 페이지로 이동한다.
		// true일 시 Pay Now로 변하고 바로 결제가 진행된다
		onAuthorize : function(data, actions) {
			return actions.payment.execute().then(function(res) {
				// 결제 성공 시 콜백파라미터인 res에 데이터가 담겨온다
				console.log(res);
			});
		}
	}, '#pay-test-btn');