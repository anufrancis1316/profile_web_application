import { TestBed } from '@angular/core/testing';

import { ContactmeserviceService } from './contactmeservice.service';

describe('ContactmeserviceService', () => {
  let service: ContactmeserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ContactmeserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
